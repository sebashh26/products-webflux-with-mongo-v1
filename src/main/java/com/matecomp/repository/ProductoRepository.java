package com.matecomp.repository;

import com.matecomp.model.Producto;
import org.springframework.data.mongodb.repository.DeleteQuery;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**En resumen:
Tú defines la interfaz.
Spring Data genera la implementación en tiempo de ejecución.
Así puedes usar métodos CRUD sin escribir código repetitivo.
 Por eso podemos extender */


public interface ProductoRepository extends ReactiveMongoRepository<Producto, Integer> {

    Flux<Producto> findByCategoria(String categoria);

    Mono<Void> deleteByNombre(String name);

    @DeleteQuery(value = "{'precioUnitario': {$lt:?0}}")
    Mono<Void> deleteByPrecio(double precio);


}
