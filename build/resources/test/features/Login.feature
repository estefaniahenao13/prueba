Feature: Login
 @LoginSuccessful
   Scenario Outline: Login
Given El cliente abre la pagina web
When  El cliente <usuario> y <contrasena>
Then debo ver mi cuenta <validtexto>
   Examples:
     | usuario | contrasena | validtexto                            |
     | test01  | 123test*   | Your nearest branch closes in: 30m 5s |
