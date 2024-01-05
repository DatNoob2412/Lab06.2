package com.example.lab062;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private NewsAdapter newsAdapter;
    private List<NewsItem> newsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        FloatingActionButton fabAddNews = findViewById(R.id.fabAddNews);

        // Khởi tạo danh sách tin tức
        newsList = new ArrayList<>();
        newsList.add(new NewsItem("https://example.com/image1.jpg", "News Title 1", "https://example.com/news1"));
        newsList.add(new NewsItem("https://example.com/image2.jpg", "News Title 2", "https://example.com/news2"));

        // Khởi tạo và đặt Adapter cho RecyclerView
        newsAdapter = new NewsAdapter(this, newsList);
        recyclerView.setAdapter(newsAdapter);

        // Thiết lập layout cho RecyclerView (Linear Layout)
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Bắt sự kiện click cho FloatActionButton
        fabAddNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Xử lý thêm tin tức ở đây
                // Ví dụ: mở một activity để thêm tin tức mới
            }
        });
    }
}
