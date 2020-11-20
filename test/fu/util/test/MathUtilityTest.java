/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.util.test;

import fu.util.MathUtility;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author giao-lang
 */
public class MathUtilityTest {
    
    @Test  //biến hàm ở trong class này thành public static void main()
    //nhờ bộ thư viện JUnit.
    //tại sao cần vậy, vì mặc định app từ main() chuẩn
    //trong khi đó mình cần test thử hàm thoy, ko can thiệp main()
    //vậy mình cần main() khác, @Test giúp điều đó
    //nhưng vì có nhiều main() CPU bị bối rối khi nhấn F6
    //F6 dành cho main() default
    //Shift F6 dành cho bên này
    
    //cú pháp đặt tên hàm dùng để test hàm khác của dân QC
    public void getFactorial_RunsWell_IfValidArgument() {
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(1, MathUtility.getFactorial(0));
    }
    
    //bắt ngoại lệ thế nào???
    //ngoại lệ Exception ko phải là 1 value để mà so sánh
    //do đó dùng hàm assertX() là ko đc, vì ko là value để so
    //ta phải dùng kĩ thuật khác
    @Test(expected = IllegalArgumentException.class)
    public void getFactorial_ThrowsException_IfInvalidArgument() {
        MathUtility.getFactorial(-5);
    }
            
            
    
}
