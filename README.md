# am1_group2016_2 Lesson 9

User Interface II

    - ListView and Adapters
    - Implementing navigation
    - Application
    
 2. Implementing Navigation
    - Intent
    
    Los intent nos permiten navegar entre pantallas (Activity) y tambien poder pasar información entre ellas.
    ```
       //Actividad inicial, Siguiente Actividad
        Intent intent = new Intent(SplashActivity.this,LoginActivity.class);
        startActivity(intent);
    ```
    En este ejemplo me encuentro en la pantalla "SplashActivity" y voy a la vista "LoginActivity" ,en ese orden (1)->(2). Luego  con el método "startActivity" ejecuto la acción del "Intent". Android guarda por defecto un historial de navegación, porque lo cual tiene referencia de las actividades "SplashActivity()" y "LoginActivity" , inclusive el orden en el que fueron invocadas. Si nosotros deseamos destruir la vista actual y que no la guarde en el historial usamos el método "finish()".
    
     ```
       //Actividad inicial, Siguiente Actividad
        Intent intent = new Intent(SplashActivity.this,LoginActivity.class);
        startActivity(intent);
        finish();
     ```
   Si no utilizo el método  "finish()" cuando navego de SplashActivty(1) a LoginActivity(2), se  guarda en el historial de navegación (1) -> (2) y si uso el botón back  de Android en LoginActivity voy a poder regresar de (2) -> (1) . Luego nos quedamos en el LoginActivity como pantalla principal y si le damos back nuevamente se cierra la APP. Recomiendo siempre tener solo una Activity activa y controlar nosotros por programación todo el flujo de la APP.
        
References :

   - [https://developer.android.com/training/basics/firstapp/starting-activity.html](https://developer.android.com/training/basics/firstapp/starting-activity.html)
   
   
