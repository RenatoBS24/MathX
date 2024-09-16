package com.Mathx;

public final class Mathx {
    public static final double E = 2.7182818284;
    public static final double PI = 3.14159265358979323846;

    public static long factorial(int a){
        if(a<0){
            throw new ArithmeticException("negative number are not allowed");
        }
        if(a>20){
            throw new ArithmeticException("number out of range");
        }
        long result = 1;
        if(a == 0){
            return result;
        }
        for(int i = 1; i<=a;i++){
            result = result*i;
        }
        return result;
    }


    public static long sum(long [] array){
        long result = 0;
        for(Long number:array){
            result+=number;
        }
        return result;
    }
    public static int sum(int [] array){
        int result = 0;
        for(Integer number:array){
            result+=number;
        }
        return result;
    }
    public static double sum(double [] array){
        double result = 0;
        for(Double number:array){
            result+=number;
        }
        return result;
    }
    public static float sum(float [] array){
        float result = 0;
        for(Float number:array){
            result+=number;
        }
        return result;
    }

    public static int abs(final int a) {
        int b = 0;
        if(a<0){
            b = a+(a*-2);
            return b;
        }
        return a;
    }
    public static double abs(final double a) {
        double b = 0;
        if(a<0){
            b = a+(a*-2);
            return b;
        }
        return a;
    }
    public static float abs(final float a) {
        float b = 0;
        if(a<0){
            b = a+(a*-2);
            return b;
        }
        return a;
    }
    public static long abs(final long a) {
        long b = 0;
        if(a<0){
            b = a+(a*-2);
            return b;
        }
        return a;
    }
    public static double acos(final double a){
        return Math.acos(a);
    }
    public static int addExact(final int a, final int b) {
        try{
           return Math.addExact(a,b);
        }catch (ArithmeticException e){
            throw new ArithmeticException("overflow ocurred: "+e.getMessage());
        }
    }
    public static long addExact(final long a, final long b) {
        try{
            return Math.addExact(a,b);
        }catch (ArithmeticException e){
            throw new ArithmeticException("overflow ocurred: "+e.getMessage());
        }
    }
    public static double asin(final double a) {
        return Math.asin(a);
    }
    public static double atan(final double a) {
        return Math.atan(a);
    }
    public static double atan2(final double a, final double b) {
        return Math.atan2(a,b);
    }
    public static double cbrt(final double a) {
        return Math.cbrt(a);
    }
    /* Returns the smallest (closest to negative infinity) double value that is greater than or equal to the argument and is equal to a mathematical integer. Special cases:
    If the argument value is already equal to a mathematical integer, then the result is the same as the argument.
    If the argument is NaN or an infinity or positive zero or negative zero, then the result is the same as the argument.
    If the argument value is less than zero but greater than -1.0, then the result is negative zero.
    Note that the value of Math.ceil(x) is exactly the value of -Math.floor(-x).*/
    public static double ceil(final double a) {
        return Math.ceil(a);
    }
    public static double copySing(final double magnitude,final double sign) {
        return Math.copySign(magnitude,sign);
    }
    public static float copySing(final float magnitude,final float sign) {
        return Math.copySign(magnitude,sign);
    }
    public static double cos(final double a) {
        return Math.cos(a);
    }
    public static double cosh(final double a) {
        return Math.cosh(a);
    }
    public static int decrementExact(final int a) {
        try {
            return Math.decrementExact(a);
        }catch (ArithmeticException e){
            throw new ArithmeticException("overflow ocurred: "+e.getMessage());
        }
    }
    public static long decrementExact(final long a) {
        try {
            return Math.decrementExact(a);
        }catch (ArithmeticException e){
            throw new ArithmeticException("overflow ocurred: "+e.getMessage());
        }
    }
    public static double exp(final double a) {
        return Math.exp(a);
    }
    public static double expm1(final double a) {
        return Math.expm1(a);
    }
    public static double floor(final double a) {
        return Math.floor(a);
    }
    public static int floorDiv(final int a, final int b) {
        try{
            return Math.floorDiv(a,b);
        }catch (ArithmeticException e){
            throw new ArithmeticException("Cannot be divided by zero: "+e.getMessage());
        }
    }
    public static long floorDiv(final long a, final long b) {
        try{
            return Math.floorDiv(a,b);
        }catch (ArithmeticException e){
            throw new ArithmeticException("Cannot be divided by zero: "+e.getMessage());
        }
    }
    public static int floorMod(final int a, final int b) {
        try{
            return Math.floorMod(a,b);
        }catch (ArithmeticException e){
            throw new ArithmeticException("Cannot be divided by zero: "+e.getMessage());
        }
    }
    public static long floorMod(final long a, final long b) {
        try{
            return Math.floorMod(a,b);
        }catch (ArithmeticException e){
            throw new ArithmeticException("Cannot be divided by zero: "+e.getMessage());
        }
    }
    public static int getExponent(final double a) {
        return Math.getExponent(a);
    }
    public static int getExponent(final float a) {
        return Math.getExponent(a);
    }
    public static double hypot(final double a, final double b) {
        return Math.hypot(a,b);
    }
    public static double IEEEremainder(final double f1, final double f2) {
        return Math.IEEEremainder(f1,f2);
    }
    public static int incrementExact(final int a) {
        try {
            return Math.incrementExact(a);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Overflow ocurred: "+e.getMessage());
        }
    }
    public static long incrementExact(final long a) {
        try {
            return Math.incrementExact(a);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Overflow ocurred: "+e.getMessage());
        }
    }
    public static double log(final double a) {
        return Math.log(a);
    }
    public static double log10(final double a) {
        return Math.log10(a);
    }
    public static double log1p(final double a) {
        return Math.log1p(a);
    }
    public static double max(final double a, final double b) {
        return Math.max(a,b);
    }
    public static float max(final float a, final float b) {
        return Math.max(a,b);
    }
    public static int max(final int a, final int b) {
        return Math.max(a,b);
    }
    public static long max(final long a, final long b) {
        return Math.max(a,b);
    }
    public static double min(final double a, final double b) {
        return Math.min(a,b);
    }
    public static float min(final float a, final float b) {
        return Math.min(a,b);
    }
    public static int min(final int a, final int b) {
        return Math.min(a,b);
    }
    public static long min(final long a, final long b) {
        return Math.min(a,b);
    }
    public static int multiplyExact(final int a, final int b) {
        try {
            return Math.multiplyExact(a,b);
        }catch (ArithmeticException e){
            throw new ArithmeticException("overflow ocurred: "+e.getMessage());
        }
    }
    public static long multiplyExact(final long a, final long b) {
        try {
            return Math.multiplyExact(a,b);
        }catch (ArithmeticException e){
            throw new ArithmeticException("overflow ocurred: "+e.getMessage());
        }
    }
    public static int negateExact(final int a) {
        try{
            return Math.negateExact(a);
        }catch (ArithmeticException e){
            throw new ArithmeticException("overflow ocurred: "+e.getMessage());
        }
    }
    public static long negateExact(final long a) {
        try{
            return Math.negateExact(a);
        }catch (ArithmeticException e){
            throw new ArithmeticException("overflow ocurred: "+e.getMessage());
        }
    }
    /*Returns the floating-point number adjacent to the first argument in the direction of the second argument. If both arguments compare as equal the second argument is returned.
    Special cases:
    If either argument is a NaN, then NaN is returned.
    If both arguments are signed zeros, direction is returned unchanged (as implied by the requirement of returning the second argument if the arguments compare as equal).
    If start is ±Double.MIN_VALUE and direction has a value such that the result should have a smaller magnitude, then a zero with the same sign as start is returned.
    If start is infinite and direction has a value such that the result should have a smaller magnitude, Double.MAX_VALUE with the same sign as start is returned.
    If start is equal to ± Double.MAX_VALUE and direction has a value such that the result should have a larger magnitude, an infinity with same sign as start is returned.*/
    public static double nextAfter(final double start, final double direction) {
        return Math.nextAfter(start,direction);
    }
    public static float nextAfter(final float start, final double direction) {
        return Math.nextAfter(start,direction);
    }
    public static double nextDown(final double a){
        return Math.nextDown(a);
    }
    public static float nextDown(final float f){
        return Math.nextDown(f);
    }
    public static double nextUp(final double a){
        return Math.nextUp(a);
    }
    public static float nextUp(final float f){
        return Math.nextUp(f);
    }
    public static double pow(final double a, final double b){
        return Math.pow(a,b);
    }
    public static double random(){
        return Math.random();
    }
    public static double rint(final double a){
        return Math.rint(a);
    }
    public static long round(final double a){
        return Math.round(a);
    }
    public static int round(final float a){
        return Math.round(a);
    }
    /*Returns d × 2scaleFactor rounded as if performed by a single correctly rounded
    floating-point multiply to a member of the double value set. See the Java Language
    Specification for a discussion of floating-point value sets. If the exponent of the
    result is between Double.MIN_EXPONENT and Double.MAX_EXPONENT, the answer is
    calculated exactly. If the exponent of the result would be larger than
    Double.MAX_EXPONENT, an infinity is returned. Note that if the result is subnormal,
    precision may be lost; that is, when scalb(x, n) is subnormal, scalb(scalb(x, n), -n)
    may not equal x. When the result is non-NaN, the result has the same sign as d.
    */
    public static double scalb(double d, int scaleFactor){
        return Math.scalb(d,scaleFactor);
    }
    public static float scalb(float d, int scaleFactor){
        return Math.scalb(d,scaleFactor);
    }
    /*Returns the signum function of the argument; zero if the argument is zero, 1.0 if the argument is greater than zero, -1.0 if the argument is less than zero.
    Special Cases:
    If the argument is NaN, then the result is NaN.
    If the argument is positive zero or negative zero, then the result is the same as the argument.*/
    public static double signum(final double d){
        return Math.signum(d);
    }
    public static float signum(final float f){
        return Math.signum(f);
    }
    public static double sin (double a){
        return Math.sin(a);
    }
    public static double sinh(double x){
        return Math.sinh(x);
    }
    public static double sqrt(double a){
        return Math.sqrt(a);
    }
    public static int subtractExact(int x, int y){
        try {
            return Math.subtractExact(x,y);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Overflow ocurred:"+e.getMessage());
        }
    }
    public static long subtractExact(long x, long y){
        try {
            return Math.subtractExact(x,y);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Overflow ocurred:"+e.getMessage());
        }
    }
    public static double tan(double a){
        return Math.tan(a);
    }
    /*Returns the hyperbolic tangent of a double value. The hyperbolic tangent of x
     is defined to be (ex - e-x)/(ex + e-x), in other words, sinh(x)/cosh(x).
     Note that the absolute value of the exact tanh is always less than 1.
     */
    public static double tanh(double x){
        return Math.tanh(x);
    }
    /*Converts an angle measured in radians to an approximately equivalent angle
    measured in degrees. The conversion from radians to degrees is generally inexact;
    users should not expect cos(toRadians(90.0)) to exactly equal 0.0.
     */
    public static double toDegrees(double angrad){
        return Math.toDegrees(angrad);
    }
    /*Returns the value of the long argument; throwing an exception if the value overflows an int.*/
    public static int toIntExact(long value){
        try {
            return Math.toIntExact(value);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Overflow ocurred: "+e.getMessage());
        }
    }
    /*Converts an angle measured in degrees to an approximately equivalent angle measured
    in radians. The conversion from degrees to radians is generally inexact.
     */
    public static double toRadians(double angdeg){
        return Math.toRadians(angdeg);
    }
    /*Returns the size of an ulp of the argument. An ulp, unit in the last place,
    of a double value is the positive distance between this floating-point value and
    the double value next larger in magnitude. Note that for non-NaN x, ulp(-x) == ulp(x).
     */
    public static double ulp(double d){
        return Math.ulp(d);
    }
    public static float ulp(float f){
        return Math.ulp(f);
    }

    public static void order(int [] array){
        if(array.length >= 20){
            int xd = (int) (Math.random()*15);
        }
    }

    public static Quadratic quadraticFormula(double a, double b, double c){
        double X1=0.0,X2=0.0, discriminate;
        double numerator01, denominator,numerator02;
        try{
            Double.parseDouble(String.valueOf(a));
            Double.parseDouble(String.valueOf(b));
            Double.parseDouble(String.valueOf(c));
            discriminate = Mathx.pow(b,2) - (4*a*c);

            if (discriminate < 0){
                return new Quadratic();
            }
            numerator01 = -(b) + Mathx.sqrt(discriminate);
            denominator = 2*a;

            numerator02 = -(b) - Mathx.sqrt(discriminate);

            X1=numerator01/ denominator;
            X2=numerator02/denominator;
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
        return new Quadratic(X1,X2);
    }
}
