package com.app.nhasach.admin;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.nhasach.R;
import com.app.nhasach.adapter.KhoHangAdapter;
import com.app.nhasach.dao.sanPhamDao;
import com.app.nhasach.model.SanPham;
import java.util.List;

public class KhoHangActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private KhoHangAdapter khoHangAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kho_hang);

        recyclerView = findViewById(R.id.recyclerViewKhoHang);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        sanPhamDao sanPhamDao = new sanPhamDao(this);
        List<SanPham> sanPhamList = sanPhamDao.getDanhsachSanPham(); // Lấy danh sách sản phẩm

        khoHangAdapter = new KhoHangAdapter(this, sanPhamList);
        recyclerView.setAdapter(khoHangAdapter);
    }
}
