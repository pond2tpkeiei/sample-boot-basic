package th.mfu;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long>{
    @SuppressWarnings("null")
    List<Customer> findAll();
    List<Customer> findByName(String name);
}