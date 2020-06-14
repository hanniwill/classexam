package temp;
import com.dd1.myfinalapp.MainActivity;
import android.content.Context;
import android.database.Cursor;
import com.dd1.myfinalapp.R;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.widget.SimpleCursorAdapter;
import android.widget.Adapter;

public class MyAdapter {
    private Context context;
    private MainActivity main;
    private Cursor[] cursors = new Cursor[7];
    private SimpleCursorAdapter[] adapter;

    private SharedPreferences preferences;

    public MyAdapter(Context context){
        this.context=context;
        main=(MainActivity) context;
    }
    public void test(){



    }
}
