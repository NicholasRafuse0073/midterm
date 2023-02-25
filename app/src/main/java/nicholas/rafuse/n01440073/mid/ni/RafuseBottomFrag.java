package nicholas.rafuse.n01440073.mid.ni;
//Nicholas Rafuse, N01440073, CENG-258-0NB
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RafuseBottomFrag extends Fragment {

    TextView textView;

    public RafuseBottomFrag() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rafuse_bottom, container, false);

        textView = view.findViewById(R.id.textView3);


        return view;
    }

    public void display(String text){
        textView.setText(text);
    }
}