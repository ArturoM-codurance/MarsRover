describe('template spec', () => {
  it('passes', () => {
    cy.visit('http://mars-rover-frontend.s3-website.eu-west-2.amazonaws.com/')
    cy.get("input[type='text']").type("MMRML")
    cy.contains("Execute").click()
    cy.get("p").should("contain","1:2:N")
  })
})