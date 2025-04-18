package com.example.repository;

import com.example.model.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRepository extends JpaRepository<Discount, Integer> {
    // Có thể thêm các phương thức tìm kiếm theo yêu cầu
}
