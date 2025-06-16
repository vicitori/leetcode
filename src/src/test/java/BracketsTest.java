import org.junit.jupiter.api.Test;

import java.util.List;
import solutions.SolutionBrackets;

import static org.junit.jupiter.api.Assertions.*;

public class BracketsTest {
    @Test
    public void isValidTest1() {
        String s = "";
        assertTrue(SolutionBrackets.isValid(s));}

    @Test
    public void isValidTest2() {
        String s = "()";
        assertTrue(SolutionBrackets.isValid(s));}
    @Test
    public void isValidTest3() {
        String s = "(]";
        assertFalse(SolutionBrackets.isValid(s));}
    @Test
    public void isValidTest4() {
        String s = "{(]]";
        assertFalse(SolutionBrackets.isValid(s));}
    @Test
    public void isValidTest5() {
        String s = "((((((()))))))";
        assertTrue(SolutionBrackets.isValid(s));}

    @Test
    public void isValidTest6() {
        String s = "((((((())))))";
        assertFalse(SolutionBrackets.isValid(s));}

    @Test
    public void isValidTest7() {
        String s = "((([(((())))])))";
        assertTrue(SolutionBrackets.isValid(s));}

    @Test
    public void isValidTest8() {
        String s = "(";
        assertFalse(SolutionBrackets.isValid(s));}

    @Test
    public void isValidTest9() {
        String s = "]";
        assertFalse(SolutionBrackets.isValid(s));}

}
