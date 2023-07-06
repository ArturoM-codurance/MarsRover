resource "aws_s3_bucket" "frontend_bucket" {
  bucket = "mars-rover-frontend"
}

resource "aws_s3_bucket_website_configuration" "frontend_example" {
  bucket = aws_s3_bucket.frontend_bucket.bucket
  index_document {
    suffix = "index.html"
  }
}

resource "aws_s3_object" "frontend_files" {
  for_each = fileset(var.frontend_directory, "**")

  bucket       = aws_s3_bucket.frontend_bucket.id
  key          = each.value
  source       = "${var.frontend_directory}/${each.value}"
  etag         = filemd5("${var.frontend_directory}/${each.value}")
  content_type = lookup(local.mime_types, regex("\\.[^.]+$", each.value), null)

}

resource "aws_s3_bucket_public_access_block" "frontend_bucket" {
  bucket = aws_s3_bucket.frontend_bucket.id

  block_public_acls   = false
  block_public_policy = false
}

resource "aws_s3_bucket_policy" "frontend-policy" {
  bucket = aws_s3_bucket.frontend_bucket.id
  policy = data.aws_iam_policy_document.allow_access.json

}

data "aws_iam_policy_document" "allow_access" {
  statement {

    principals {
      type = "AWS"
      identifiers = ["*"]
    }

    effect = "Allow"

    sid = ""

    actions = [
      "s3:GetObject",
    ]

    resources = [
      aws_s3_bucket.frontend_bucket.arn,
      "${aws_s3_bucket.frontend_bucket.arn}/*",
    ]
  }
}

locals {
  mime_types = {
    ".js": "text/javascript",
    ".html": "text/html",
    ".css": "text/css",
    ".svg": "image/svg+xml"
  }
}