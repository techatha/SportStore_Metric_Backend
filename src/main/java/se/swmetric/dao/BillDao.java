package se.swmetric.dao;

import se.swmetric.entity.Bill;

import java.util.List;

public interface BillDao {
    Integer getBillSize();
    List<Bill> getBills();
    Bill getBill(Long id);
    Bill save(Bill bill);
}
