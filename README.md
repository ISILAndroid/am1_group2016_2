# am1_group2016_2 Lesson 9

User Interface II

    - ListView and Adapters
    - Implementing navigation
    - Application
    
 2. Implementing Navigation
    - Intent
    
    Los intent nox permiten navegar entre pantallas (Activity) y tambien poder pasar información entre ellas.
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
   
References :

   - [https://developer.android.com/training/basics/firstapp/starting-activity.html](https://developer.android.com/training/basics/firstapp/starting-activity.html)
   
   
