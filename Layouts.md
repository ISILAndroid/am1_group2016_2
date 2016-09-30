
### Layouts

  1. Use margins and paddings
    - Margin : permite separar un elemento de los demas , usando MARGIN TOP, BOTTOM, LEFT, RIGHT
    ```
      <?xml version="1.0" encoding="utf-8"?>
      <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
          android:orientation="vertical" android:layout_width="match_parent"
          android:layout_height="match_parent">

          <Button
              android:layout_width="match_parent"
              android:layout_height="wrap_content"
              android:text="New Button"
              android:id="@+id/button"
              android:layout_gravity="center_horizontal" />

          <Button
              android:layout_width="match_parent"
              android:layout_height="wrap_content"
              android:text="New Button"
              android:layout_marginLeft="20dp"
              android:layout_marginRight="20dp"
              android:layout_marginTop="20dp"
              android:layout_marginBottom="20dp"
              android:id="@+id/button7"
              android:layout_gravity="center_horizontal" />

          <Button
              android:layout_width="match_parent"
              android:layout_height="wrap_content"
              android:text="New Button"
              android:id="@+id/button8"
              android:layout_gravity="center_horizontal" />
      </LinearLayout>
   ```
   - Padding : permite definir un espacio interno de un elemento o contenedor , usando PADDING TOP, BOTTOM, LEFT, RIGHT
  
    ```
      <?xml version="1.0" encoding="utf-8"?>
      <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
          android:orientation="vertical" android:layout_width="match_parent"
          android:layout_height="match_parent"
          android:paddingLeft="20dp"
          android:paddingRight="20dp"
          android:paddingTop="30dp"
          android:paddingBottom="30dp">

              <Button
                  android:layout_width="match_parent"
                  android:layout_height="wrap_content"
                  android:text="New Button"
                  android:id="@+id/button1" />

              <Button
                  android:layout_width="match_parent"
                  android:layout_height="wrap_content"
                  android:text="New Button"
                  android:id="@+id/button2" />

              <Button
                  android:layout_width="match_parent"
                  android:layout_height="wrap_content"
                  android:text="New Button"
                  android:id="@+id/button3" />        

              <Button
                  android:layout_width="match_parent"
                  android:layout_height="wrap_content"
                  android:text="New Button" />    
              <Button
                  android:layout_width="match_parent"
                  android:layout_height="wrap_content"
                  android:text="New Button" />
      </LinearLayout>

    ```
    
  2. Gravity and LayoutGravity
    - Gravity permite alinearlo los elementos de un contenedor , ya sea horizontalmente como verticalmente.
      ```
        <?xml version="1.0" encoding="utf-8"?>
        <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android" 
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:gravity="center"
            android:orientation="vertical">


            <Button
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="New Button"/>

        </LinearLayout>
      ```
      
    - LayoutGravity permite a un elemento poder alinearse respecto a su contenedor 
      ```
        <?xml version="1.0" encoding="utf-8"?>
        <FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
            android:layout_width="match_parent"
            android:layout_height="match_parent">

                <Button
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="New Button"
                    android:id="@+id/button9"
                    android:layout_gravity="center_horizontal|center_vertical" />

        </FrameLayout>
      ```
      
  
  3. Examples
