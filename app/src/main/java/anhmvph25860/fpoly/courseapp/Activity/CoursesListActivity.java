package anhmvph25860.fpoly.courseapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import anhmvph25860.fpoly.courseapp.Adapter.CoursesAdapter;
import anhmvph25860.fpoly.courseapp.Domain.CoursesDomain;
import anhmvph25860.fpoly.courseapp.R;

public class CoursesListActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterCourceList;
    private RecyclerView recyclerViewCource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_list);

        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<CoursesDomain> items = new ArrayList<>();
        items.add(new CoursesDomain("Advanced certification Program in AI",169,"ic_1"));
        items.add(new CoursesDomain("Google Cloud Platform Architecture",69,"ic_2"));
        items.add(new CoursesDomain("Fundamenatal of java Programming",150,"ic_3"));
        items.add(new CoursesDomain("Introduction to UI design history",79,"ic_4"));
        items.add(new CoursesDomain("PG Program in Big Data Engineering",49,"ic_5"));

        recyclerViewCource = findViewById(R.id.view);
        recyclerViewCource.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        adapterCourceList = new CoursesAdapter(items);
        recyclerViewCource.setAdapter(adapterCourceList);
    }
}