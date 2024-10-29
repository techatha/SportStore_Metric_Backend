package se.swmetric.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import se.swmetric.Repository.BillRepository;
import se.swmetric.entity.Bill;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BillDaoImpl implements BillDao {
    final BillRepository billRepository;

    @Override
    public Integer getBillSize() {
        return Math.toIntExact (billRepository.count());
    }

    @Override
    public List<Bill> getBills() {
        return billRepository.findAll();
    }

    @Override
    public Bill getBill(Long id) {
        return billRepository.findById(id).orElse(null);
    }

    @Override
    public Bill save(Bill bill) {
        return billRepository.save(bill);
    }
}
