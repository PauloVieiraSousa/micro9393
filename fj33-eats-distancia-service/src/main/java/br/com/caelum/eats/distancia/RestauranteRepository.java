package br.com.caelum.eats.distancia;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

interface RestauranteRepository extends MongoRepository<Restaurante, Long> {

	Page<Restaurante> findAllByTipoDeCozinhaId(Long tipoDeCozinhaId, Pageable limit);

	List<Restaurante> findByCepAndTipoDeCozinhaId(String cep, Long tipoDeCozinha);

	Page<Restaurante> findByCep(String cep, Pageable limit);

}
