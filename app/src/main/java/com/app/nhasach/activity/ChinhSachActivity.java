package com.app.nhasach.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.app.nhasach.R;

public class ChinhSachActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinh_sach);

        ImageButton backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Button btnBaoMat = findViewById(R.id.button_chinh_sach_bao_mat);
        btnBaoMat.setOnClickListener(v -> openDetailActivity(
                "Chính sách bảo mật thông tin",
                "Chúng tôi cam kết bảo vệ thông tin cá nhân của người dùng khi mua sách trên ứng dụng. " +
                        "Dữ liệu như tên, địa chỉ, số điện thoại và lịch sử mua hàng sẽ được lưu trữ an toàn và không chia sẻ cho bên thứ ba nếu không có sự đồng ý của bạn. " +
                        "Mọi giao dịch sẽ được mã hóa để đảm bảo an toàn thông tin. " +
                        "Chúng tôi tuân thủ đầy đủ các quy định về bảo vệ dữ liệu cá nhân theo pháp luật Việt Nam.",
                "06-12-2024"
        ));

        Button btnQuyChe = findViewById(R.id.button_chinh_sach);
        btnQuyChe.setOnClickListener(v -> openDetailActivity(
                "Chính sách đổi/trả sách",
                "Khách hàng có thể đổi hoặc trả sách trong vòng 7 ngày kể từ khi nhận hàng nếu sản phẩm bị lỗi, rách, thiếu trang hoặc sai với mô tả. " +
                        "Sách cần được giữ nguyên tình trạng ban đầu, không có dấu hiệu đã qua sử dụng. " +
                        "Chúng tôi không hỗ trợ đổi/trả với lý do chủ quan như không thích nội dung. " +
                        "Mọi yêu cầu đổi/trả vui lòng liên hệ bộ phận hỗ trợ qua mục Liên hệ.",
                "06-12-2024"
        ));

        Button btnDieuKhoan = findViewById(R.id.button_thanh_toan);
        btnDieuKhoan.setOnClickListener(v -> openDetailActivity(
                "Điều khoản thanh toán & vận chuyển",
                "Ứng dụng hỗ trợ thanh toán qua tiền mặt khi nhận hàng (COD), chuyển khoản và ví điện tử. " +
                        "Sau khi xác nhận đơn hàng, chúng tôi sẽ xử lý và giao hàng trong 2–5 ngày làm việc. " +
                        "Trong trường hợp địa chỉ không rõ ràng hoặc không liên hệ được, đơn hàng có thể bị hủy. " +
                        "Người dùng cần cung cấp thông tin chính xác để đảm bảo giao hàng đúng tiến độ.",
                "06-12-2024"
        ));

        Button btnTranhChap = findViewById(R.id.button_khieu_nai);
        btnTranhChap.setOnClickListener(v -> openDetailActivity(
                "Chính sách giải quyết khiếu nại & hoàn tiền",
                "Chúng tôi sẵn sàng tiếp nhận và giải quyết khiếu nại liên quan đến đơn hàng, sản phẩm hoặc trải nghiệm mua sắm. " +
                        "Người dùng có thể gửi phản hồi qua mục Hỗ trợ khách hàng. " +
                        "Trong trường hợp hoàn tiền, thời gian xử lý là 3–7 ngày làm việc tùy theo hình thức thanh toán. " +
                        "Mọi tranh chấp sẽ được giải quyết minh bạch, dựa trên quy định hiện hành và quyền lợi người dùng.",
                "06-12-2024"
        ));
    }

    // Hàm mở Activity hiển thị chi tiết điều khoản
    private void openDetailActivity(String title, String content, String date) {
        Intent intent = new Intent(ChinhSachActivity.this, DieuKhoanActivity.class);
        intent.putExtra("title", title);
        intent.putExtra("content", content);
        intent.putExtra("date", date);
        startActivity(intent);
    }
}