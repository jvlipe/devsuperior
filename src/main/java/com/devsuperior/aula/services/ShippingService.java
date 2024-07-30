package com.devsuperior.aula.services;

import com.devsuperior.aula.entities.Order;
import org.springframework.stereotype.Service;



    @Service
    public class ShippingService {
        private static final double FRETE_BAIXO = 20.00;
        private static final double FRETE_EXCLUSIVE = 12.00;
        private static final double FRETE_GRATIS = 200.00;
        private static final double LIMITAR_FRETE_BAIXO = 100.00;

        public double shipment(Order order) {
            double valorBasico = order.getBasic();

            if (valorBasico < LIMITAR_FRETE_BAIXO) {
                return FRETE_BAIXO;
            } else if (valorBasico <= FRETE_GRATIS) {
                return FRETE_EXCLUSIVE;
            } else {
                return 0.0;
            }
        }
    }
