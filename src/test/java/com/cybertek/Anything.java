package com.cybertek;

import com.github.javafaker.Faker;

public class Anything {
    public static void main(String[] args) {
 Faker faker= new Faker();
        System.out.println(faker.pokemon().name());
        System.out.println(faker.book().title());
        System.out.println(faker.friends().getClass());
        System.out.println(faker.job().getClass());
        System.out.println(faker.music().instrument());
        System.out.println(faker.name().lastName());
        System.out.println(faker.name().firstName());
        System.out.println(faker.cat().breed());

    }
}
