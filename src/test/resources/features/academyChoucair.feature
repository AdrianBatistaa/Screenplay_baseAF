  #language:en
  #Autor: Adrian Felipe Batista Angarita
  @stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in sreenplay at the choucair Academy with the automation course
    @scenario1
    Scenario: Search for a automation course
      Given than Adrian wants to learn automation at the academy choucair
        | strUser  |  strPassword |
        | TuUsuario|  TuClave     |
      When he search for the course on the choucair academy platform
        | strCourse              |
        | Metodología Bancolombia|
      Then he finds the course called resources
        | strCourse              |
        | Metodología Bancolombia|