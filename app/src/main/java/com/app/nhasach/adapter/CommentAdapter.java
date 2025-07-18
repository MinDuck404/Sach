package com.app.nhasach.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.nhasach.R;
import com.app.nhasach.model.Comment;

import java.util.List;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.CommentViewHolder> {

    private List<Comment> commentList;

    public CommentAdapter(List<Comment> commentList) {
        this.commentList = commentList;
    }

    @NonNull
    @Override
    public CommentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.comment_item, parent, false);
        return new CommentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CommentViewHolder holder, int position) {
        Comment comment = commentList.get(position);
        holder.tenNguoiDung.setText("Người mua: " + comment.getTenNguoiDung());
        holder.ngayDanhGia.setText("Ngày đánh giá: " + comment.getNgayDanhGia());
        holder.sao.setText("Chất lượng sản phẩm : " + comment.getSao());
        holder.noiDung.setText("Nhận xét: " + comment.getNoiDung());
        double tongTien = comment.getTongTien(); // Lấy tổng tiền từ Comment
        holder.tongTien.setText(String.format("Tổng tiền mua: %,d VND", Math.round(tongTien)));
    }

    @Override
    public int getItemCount() {
        return commentList.size();
    }

    public static class CommentViewHolder extends RecyclerView.ViewHolder {

        TextView tenNguoiDung, ngayDanhGia, sao, noiDung, tongTien;

        public CommentViewHolder(View itemView) {
            super(itemView);
            tenNguoiDung = itemView.findViewById(R.id.tenNguoiDung);
            ngayDanhGia = itemView.findViewById(R.id.ngayDanhGia);
            sao = itemView.findViewById(R.id.sao);
            noiDung = itemView.findViewById(R.id.noiDung);
            tongTien = itemView.findViewById(R.id.tongTien);
        }
    }
}
