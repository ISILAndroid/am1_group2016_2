## SimpleList

1. DataSource
  
  ```
    package com.isil.simplelist.storage;


    public class Cheeses {

        public static final String[] sCheeseStrings = {
                "Abbaye de Belloc", "Abbaye du Mont des Cats", "Abertam", "Abondance", "Ackawi",
                "Acorn", "Adelost", "Affidelice au Chablis", "Afuega'l Pitu", "Airag", "Airedale",
                "Aisy Cendre", "Allgauer Emmentaler", "Alverca", "Ambert", "American Cheese",
                "Ami du Chambertin", "Anejo Enchilado", "Anneau du Vic-Bilh", "Anthoriro", "Appenzell",
                "Aragon", "Ardi Gasna", "Ardrahan", "Armenian String", "Aromes au Gene de Marc",
                "Asadero", "Asiago", "Aubisque Pyrenees", "Autun", "Avaxtskyr", "Baby Swiss",
                "Babybel", "Baguette Laonnaise", "Bakers", "Baladi", "Balaton", "Bandal", "Banon",
                "Barry's Bay Cheddar", "Basing", "Basket Cheese", "Bath Cheese", "Bavarian Bergkase",
                "Baylough", "Beaufort", "Beauvoorde", "Beenleigh Blue", "Beer Cheese", "Bel Paese",
                "Bergader", "Bergere Bleue", "Berkswell", "Beyaz Peynir", "Bierkase", "Bishop Kennedy",
                "Blarney", "Bleu d'Auvergne", "Bleu de Gex", "Bleu de Laqueuille",
                "Bleu de Septmoncel", "Bleu Des Causses", "Blue", "Blue Castello", "Blue Rathgore",
                "Blue Vein (Australian)", "Blue Vein Cheeses", "Bocconcini", "Bocconcini (Australian)",
                "Boeren Leidenkaas", "Bonchester", "Bosworth", "Bougon", "Boule Du Roves"
        };

    }

  ```
  
  2. Row (XML)
  
  ```
      <?xml version="1.0" encoding="utf-8"?>
      <TextView xmlns:android="http://schemas.android.com/apk/res/android"
          android:id="@android:id/text1"
          android:layout_width="match_parent"
          android:layout_height="wrap_content"
          android:textAppearance="?android:attr/textAppearanceListItemSmall"
          android:gravity="center_vertical"
          android:paddingStart="?android:attr/listPreferredItemPaddingStart"
          android:paddingEnd="?android:attr/listPreferredItemPaddingEnd"
          android:minHeight="?android:attr/listPreferredItemHeightSmall"
      />

  
  ```
 
 3. View (XML)
 
 ```
      <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools" android:layout_width="match_parent"
        android:layout_height="match_parent" android:paddingLeft="@dimen/activity_horizontal_margin"
        android:paddingRight="@dimen/activity_horizontal_margin"
        android:paddingTop="@dimen/activity_vertical_margin"
        android:paddingBottom="@dimen/activity_vertical_margin">


        <ListView
            android:layout_width="fill_parent"
            android:layout_height="fill_parent"
            android:id="@+id/lviCheeses"/>

    </RelativeLayout>

 ```
 
 4. Adapter 
 
  ```
    new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, mStrings)
  ```
  
  5. View (Activity)
  
  ```
      package com.isil.simplelist;

      import android.support.v7.app.ActionBarActivity;
      import android.os.Bundle;
      import android.view.View;
      import android.widget.AdapterView;
      import android.widget.ArrayAdapter;
      import android.widget.ListView;
      import android.widget.Toast;

      import com.isil.simplelist.storage.Cheeses;


      public class SimpleListActivity extends ActionBarActivity {

          private String[] mStrings = Cheeses.sCheeseStrings;
          private ListView lviCheeses;

          @Override
          protected void onCreate(Bundle savedInstanceState) {
              super.onCreate(savedInstanceState);
              setContentView(R.layout.activity_simple_list);
              lviCheeses=(ListView)findViewById(R.id.lviCheeses);
              lviCheeses.setAdapter(new ArrayAdapter<String>(this,
                      android.R.layout.simple_list_item_1, mStrings));
              lviCheeses.setTextFilterEnabled(true);

              //events
              lviCheeses.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                  @Override
                  public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                      String value= String.valueOf(adapterView.getAdapter().getItem(position));
                      showItem(value);
                  }
              });
          }

          private void showItem(String value) {

              Toast.makeText(this,"item "+value,Toast.LENGTH_LONG).show();
          }

      }

  ```
 
