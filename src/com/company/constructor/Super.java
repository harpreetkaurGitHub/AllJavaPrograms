package com.company.constructor;


class Super {

    int happy = 21;

static class SubSuper extends Super {
          int happy = 22;

        public void dis() {
            System.out.println(super.happy);
        }
    }

    public static void main(String[] args) {

        SubSuper obj = new SubSuper();

        obj.dis();
    }
}
