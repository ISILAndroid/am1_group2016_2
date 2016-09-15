# am1_group2016_2 Lesson 4

User Interface I (S4-S6)

  - Topics
  
    * Overview
    * User Interface
    
        - Layouts

        - Input Controls (Widgets)
        
        - Material Design
        
    * Input events
    * Exercises

- Group Activities

    * Group Activity #1 : Knowing the layouts
    
    * Group Activity #2 : Learning to use the weights
    
    * Group Activity #3 : Creating my first UI
    
# .

## Overview

  - Estructura de un elemento XML :
  
```
    <?xml version="1.0" encoding="utf-8"?>
    <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools" android:layout_width="match_parent"
        android:layout_height="match_parent" android:paddingLeft="@dimen/activity_horizontal_margin"
        android:paddingRight="@dimen/activity_horizontal_margin"
        android:paddingTop="@dimen/activity_vertical_margin"
        android:paddingBottom="@dimen/activity_vertical_margin">
    
        <TextView android:text="Hello World!" android:layout_width="wrap_content"
            android:layout_height="wrap_content" />
    </RelativeLayout>
```

  - ID :
  
```
      android:id="@+id/img"
```

```
      <TextView
            android:id="@+id/txtImg"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Medium Text"
            android:textAppearance="?android:attr/textAppearanceMedium" />
```
    
  - Atributos :
    
```
        android:layout_width="300dp"
```
    
  - En el código podemos invocar a los elementos XML de la siguiente manera :
  
```
      @Override
      protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main);
      }
```
    
```
     private ImageView img;
     private Button btnImg;
     private TextView txtImg;

     img= (ImageView)findViewById(R.id.img);
     btnImg= (Button)findViewById(R.id.butImg);
     txtImg = (TextView)findViewById(R.id.txtImg);
```


## User Interface

  * Layouts
  
    - LinearLayout
    
    <img src="https://github.com/ISILAndroid/am1_group2016_2/blob/Lesson4/images/linearlayout.png" height="480">

    - RelativeLayout
    
    <img src="https://github.com/ISILAndroid/am1_group2016_2/blob/Lesson4/images/relativelayout.png" height="480">
         
    - Listview, GridView , RecyclerView
    
    <img src="https://github.com/ISILAndroid/am1_group2016_2/blob/Lesson4/images/listview.png" height="480">
    
    <img src="https://github.com/ISILAndroid/am1_group2016_2/blob/Lesson4/images/gridview.png" height="480">
  
  * Exercices
  


References :
   - [https://developer.android.com/guide/topics/ui/index.html](https://developer.android.com/guide/topics/ui/index.html)
   - [https://developer.android.com/training/basics/firstapp/building-ui.html](https://developer.android.com/training/basics/firstapp/building-ui.html)
   - [https://developer.android.com/design/index.html](https://developer.android.com/design/index.html)
   - [https://developer.android.com/guide/topics/ui/declaring-layout.html](https://developer.android.com/guide/topics/ui/declaring-layout.html)
