terraform {
  required_providers {
    aws = {
      version = "5.6.2"
    }
    archive = {
      version = "2.4.0"
    }
  }

  backend "s3" {
    bucket         = "golinuxbucket12"
    key            = "frontend/terraform-tfstate"
    region         = "eu-west-2"
    dynamodb_table = "golinuxtable1"
  }
}

provider "aws" {
  region = var.aws_region

  default_tags {
    tags = {
      hashicorp-learn = "lambda-api-gateway"
    }
  }
}