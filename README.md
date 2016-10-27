# am1_group2016_2 Lesson 8

User Interface II

    - ListView, GridView,RecyclerView  and Simple List
    - Adapter and custom Adapters
    - ViewHolder Pattern
    - Examples
   
 1. ListView, GridView,RecyclerView  and Simple List
    - ListView and GridView
    
      ![](https://developer.android.com/images/ui/listview.png) ![](https://developer.android.com/images/ui/gridview.png)
            
    - Components
        * DataSource
        * Adapter
        * View
        
        ![](https://github.com/ISILAndroid/am1_group2016_2/blob/Lesson8/Android%20Adapter.png)
        
    - Simple list
 
 2. Adapter & Custom Adapters
    - Adapters
        * Cursor Adapter
        * Array Adapter
        * Base Adapter
    - Steps 
        * 1. Create model (Entity Class)
        * 2. Get Data source (List , ArrayList)
        * 3. Create row.xml
        * 4. Create adapter
        * 5. Set Adapter to View (ListView, GridView)
    
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
 
References :

   - [https://developer.android.com/guide/topics/ui/layout/listview.html](https://developer.android.com/guide/topics/ui/layout/listview.html)
   - [https://developer.android.com/guide/topics/ui/layout/gridview.html](https://developer.android.com/guide/topics/ui/layout/gridview.html)
   - [https://developer.android.com/guide/topics/ui/controls/spinner.html](https://developer.android.com/guide/topics/ui/controls/spinner.html)
   - [https://developer.android.com/guide/topics/ui/declaring-layout.html](https://developer.android.com/guide/topics/ui/declaring-layout.html)
   - [https://developer.android.com/training/improving-layouts/smooth-scrolling.html](https://developer.android.com/training/improving-layouts/smooth-scrolling.html)
   - [https://sriramramani.wordpress.com/2012/07/25/infamous-viewholder-pattern/](https://sriramramani.wordpress.com/2012/07/25/infamous-viewholder-pattern/)
   
   
   
   
