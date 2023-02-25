package nicholas.rafuse.n01440073.mid.ni;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.fragment.app.Fragment;

import java.util.Objects;

public class NickTopFrag extends Fragment {



    public NickTopFrag() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nick_top, container, false);

        Spinner spinner = view.findViewById(R.id.nicSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(requireActivity().getApplicationContext(), R.array.list, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        String[] list = getResources().getStringArray(R.array.list);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {



                RafuseBottomFrag fragment = (RafuseBottomFrag) requireActivity().getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView2);
                Objects.requireNonNull(fragment).display(list[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        return view;
    }
}

