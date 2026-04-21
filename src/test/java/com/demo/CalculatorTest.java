package com.demo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    // 加法测试：常规场景 + 边界场景
    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        // 常规值
        assertEquals(5, calc.add(2, 3));
        // 零值
        assertEquals(0, calc.add(0, 0));
        // 负数
        assertEquals(-1, calc.add(-2, 1));
    }

    // 减法测试：常规场景 + 边界场景
    @Test
    void testSubtract() {
        Calculator calc = new Calculator();
        // 常规值
        assertEquals(1, calc.subtract(2, 1));
        // 零值
        assertEquals(0, calc.subtract(5, 5));
        // 负数结果
        assertEquals(-2, calc.subtract(3, 5));
    }
}