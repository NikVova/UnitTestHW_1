package org.example;
import static org.assertj.core.api.Assertions.*;
import org.example.discountCalc;
public class Main {
    public static void main(String[] args) {
        assertThat(discountCalc.discountCalculations(50, 20)).isEqualTo(40);
        assertThat(discountCalc.discountCalculations(5.0, 2.0)).isEqualTo(4.9);
        assertThat(discountCalc.discountCalculations(0, 20)).isEqualTo(0);
        assertThat(discountCalc.discountCalculations(-50, 20)).isEqualTo(-40);
        assertThat(discountCalc.discountCalculations(50, 0)).isEqualTo(50);
        assertThat(discountCalc.discountCalculations(50, -50)).isEqualTo(75);
        assertThat(discountCalc.discountCalculations(50, 150)).isEqualTo(-25);
    }
}