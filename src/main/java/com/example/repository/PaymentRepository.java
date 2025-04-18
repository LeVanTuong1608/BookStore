package com.example.repository;

import com.example.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
    // Có thể thêm các phương thức tìm kiếm theo yêu cầu
}
