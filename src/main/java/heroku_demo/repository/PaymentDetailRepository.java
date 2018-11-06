package heroku_demo.repository;

import org.springframework.data.repository.CrudRepository;

import heroku_demo.entity.PaymentDetail;

public interface PaymentDetailRepository extends CrudRepository<PaymentDetail, Integer> {
	
	PaymentDetail getById(Integer id);

}
