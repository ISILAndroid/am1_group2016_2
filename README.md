# am1_group2016_2 Lesson 8

User Interface II

    - ListView, GridView,RecyclerView  and Simple List
    - Adapter and custom Adapters
    - ViewHolder Pattern
    - Examples
   
 1. ListView, GridView,RecyclerView  and Simple List
 
    - ListView and GridView
    
      ![](https://developer.android.com/images/ui/listview.png) ![](https://developer.android.com/images/ui/gridview.png)
          
    - Design 
    
        * Galleries [http://android.inspired-ui.com/tagged/galleries](http://android.inspired-ui.com/tagged/galleries)
        
        * Lists [http://android.inspired-ui.com/tagged/lists](http://android.inspired-ui.com/tagged/lists)
        
    - Components
    
        * DataSource
        * Adapter
        * View
        
        ![](https://github.com/ISILAndroid/am1_group2016_2/blob/Lesson8/Android%20Adapter.png)
        
    - Simple list
    
        Link [https://github.com/ISILAndroid/am1_group2016_2/blob/Lesson8/SIMPLELIST.md](https://github.com/ISILAndroid/am1_group2016_2/blob/Lesson8/SIMPLELIST.md)
 
 2. Adapter & Custom Adapters
 
    - Adapters
        * Cursor Adapter
        * Array Adapter
        * Base Adapter
            
    - Structure
    
        BaseAdapter [link](https://github.com/ISILAndroid/am1_group2016_2/blob/Lesson8/ADAPTER.md)
        
    - Steps 
    
        * 1. Create model (Entity Class)
        * 2. Get Data source (List , ArrayList)
        * 3. Create row.xml
        * 4. Create adapter
        * 5. Set Adapter to View (ListView, GridView)
        
    - Custom Adapter
        
        * Row (xml) [https://gist.github.com/emedinaa/b84637ec96f1f6d13a9e73f43e57c0f0](https://gist.github.com/emedinaa/b84637ec96f1f6d13a9e73f43e57c0f0)
        
        * Data Source [https://gist.github.com/emedinaa/386107dd21f498aa1b328484e836a5a4](https://gist.github.com/emedinaa/386107dd21f498aa1b328484e836a5a4)
        
        * Adapter [https://gist.github.com/emedinaa/bed1a54b1ec60e60d940db5c3ccef90c](https://gist.github.com/emedinaa/bed1a54b1ec60e60d940db5c3ccef90c)
        
        * View [https://gist.github.com/emedinaa/9a16a352e8fddbde21d3436ea0b4c124](https://gist.github.com/emedinaa/9a16a352e8fddbde21d3436ea0b4c124)
        
        * Activity [https://gist.github.com/emedinaa/de335790a356cf51ebc9cf5b229f741d](https://gist.github.com/emedinaa/de335790a356cf51ebc9cf5b229f741d)
        
 3. ViewHolder Pattern
 
    ```
        class ViewHolder {
            ImageView icon;
            TextView title;
            TextView subtitle;
        }
    ```
    ```
        // Inside the adapter
        public void getView(int position, View convertView, ViewGroup parent) {
            // if convertView is null, the view is newly inflated.
            // else, re-assign new values.
            ViewHolder holder;
            if (convertView == null) {
                convertView = LayoutInflater.from(context).inflate(R.layout.row, null);

                // Set up the ViewHolder.
                holder = new ViewHolder();
                holder.icon = (ImageView) findViewById(R.id.icon);
                holder.title = (TextView) findViewById(R.id.title);
                holder.subtitle = (TextView) findViewById(R.id.subtitle);

                // Store the holder with the view.
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            // Assign values
            holder.icon.setImageDrawable(some_image);
            holder.title.setText(some_text);
            holder.subtitle.setText(some_text);
        }
    ```
    
 4. Events
    
    - setOnItemClickListener
    
        ```
           lviCheeses.setOnItemClickListener(new AdapterView.OnItemClickListener() {
               @Override
               public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    String value= String.valueOf(adapterView.getAdapter().getItem(position));
                    showItem(value);
                }
           });
        ```
        
 
References :

   - [https://developer.android.com/guide/topics/ui/layout/listview.html](https://developer.android.com/guide/topics/ui/layout/listview.html)
   - [https://developer.android.com/guide/topics/ui/layout/gridview.html](https://developer.android.com/guide/topics/ui/layout/gridview.html)
   - [https://developer.android.com/guide/topics/ui/controls/spinner.html](https://developer.android.com/guide/topics/ui/controls/spinner.html)
   - [https://developer.android.com/guide/topics/ui/declaring-layout.html](https://developer.android.com/guide/topics/ui/declaring-layout.html)
   - [https://developer.android.com/training/improving-layouts/smooth-scrolling.html](https://developer.android.com/training/improving-layouts/smooth-scrolling.html)
   - [https://sriramramani.wordpress.com/2012/07/25/infamous-viewholder-pattern/](https://sriramramani.wordpress.com/2012/07/25/infamous-viewholder-pattern/)
   
   
   
   
