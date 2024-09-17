package com.Mathx;

public class Quadratic {
        private double X1,X2;
        private final boolean real;
        public Quadratic(double X1, double X2) {
            this.X1 = X1;
            this.X2 = X2;
            this.real = true;
        }

        public Quadratic(){
            this.real = false;
        }

        @Override
        public String toString() {
            return real? "X1: "+X1+", X2: "+X2:"the equation has complex solutions";
        }
}
