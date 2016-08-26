# am1_group2016_2 Lesson2

Introduction to Android & App Fundamentals (S1-S3)

- Group Activities

    * Group Activity #1 : Building a Simple User Interface
      ![hello world](https://github.com/ISILAndroid/am1_group2016_2/blob/Lesson2/hello_world.png =250x)
    
      [ExampleImages](https://github.com/ISILAndroid/am1_group2016_2/tree/Lesson2/ExampleImages)
    
    * Group Activity #2 : Building your calculator
    
      ![calculadora](https://github.com/ISILAndroid/am1_group2016_2/blob/Lesson2/calculadora.png =250x)
      
      Comencemos haciendo la lógica de las operaciones, para esto podemos probar su funcionamiento en el compilador de Java online [https://www.compilejava.net](https://www.compilejava.net)
      
      ```
            
         private int sumar(int op1, int op2) {
              return op1+op2;
          }
          
          private int restar(int op1, int op2) {
              return op1-op2;
          }
          
          private int multiplicar(int op1, int op2) {
              return op1*op2;
          }
          
          private int dividir(int op1, int op2) {
              //TODO validar si op2!=0
              return op1/op2;
          }
          
      ```
    
    * Group Activity #3 : Validating a registration form User
      ![form](https://github.com/ISILAndroid/am1_group2016_2/blob/Lesson2/form.png =250x)
      
      Considerar las siguientes validaciones para un formulario de registro
      ```
            private boolean validateForm() {
   
           name = eteName.getText().toString().trim();
           email = eteEmail.getText().toString().trim();
           password1 = etePassword1.getText().toString().trim();
           password2 = etePassword2.getText().toString().trim();
           clear();
   
           if (name.equals("")) {
               eteName.setError("Ingresar el nombre");
               return false;
           }
           if (email.isEmpty()) {
               eteEmail.setError("Ingresar el email");
               return false;
           }
           if (!isEmailValid(email))
           {
               eteEmail.setError("Email inválido");
               return false;
           }
           if(password1.isEmpty())
           {
               etePassword1.setError("Ingresar el password");
               return false;
           }
   
           if(password2.isEmpty())
           {
               etePassword2.setError("Ingresar el password");
               return false;
           }
           if(!password1.equals(password2))
           {
               etePassword2.setError("No conciden las contraseñas");
               return false;
           }
   
           return true;
         }
      ```
    
- References 
    * [https://developer.android.com/guide/topics/ui/index.html](https://developer.android.com/guide/topics/ui/index.html)
