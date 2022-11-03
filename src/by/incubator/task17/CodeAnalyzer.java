package by.incubator.task17;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

import static by.incubator.task17.console.Writer.print;

public class CodeAnalyzer {

    private static Object ob = null;

    public static void analyzeCode(Object o) {
        ob = o;
        printClassName();
        printClassLoader();
        printImplements();
        printHierarchy();
        printFields();
        printConstructors();
        printMethods(o.getClass().getMethods());
        printClassAnnotation();
    }

    private static void printClassAnnotation() {
        print("Class annotations: ");
        printAnnotatedElements(ob.getClass());
    }

    private static void printConstructors() {
        Constructor[] constructors = ob.getClass().getDeclaredConstructors();

        print("Constructors: ");
        for (Constructor constructor: constructors) {
            printConstructor(constructor);
        }
    }

    private static void printConstructor(Constructor constructor) {
        print("\tConstructor: ");
        printModifier(constructor.getModifiers());
        printParameters(constructor);
        printAnnotatedElements(constructor);
    }

    private static void printParameters(Constructor constructor) {
        Parameter[] parameters = constructor.getParameters();
        print("\t\tParameters:");
        for (Parameter parameter: parameters) {
            printParameterSimpleName(parameter);
            print("\t\tIs final: " + checkIsParameterFinal(parameter));
            printAnnotatedElements(parameter);
        }
    }

    private static void printParameterSimpleName(Parameter parameter) {
        print("\t\tType: " + parameter.getType().getSimpleName());
    }

    private static boolean checkIsParameterFinal(Parameter parameter) {
        return Modifier.isFinal(parameter.getModifiers());
    }
    private static void printFields() {
        Field[] fields = ob.getClass().getDeclaredFields();

        print("Fields: ");
        for (Field field: fields) {
            printField(field);
        }
    }

    private static void printField(Field field) {
        printFieldName(field);
        printFieldType(field);
        printModifier(field.getModifiers());
        printAnnotatedElements(field);
    }

    private static void printAnnotatedElements(AnnotatedElement annotatedElement) {
        print("\tAnnotations:");
        Annotation[] annotations = annotatedElement.getDeclaredAnnotations();
        for (Annotation annotation: annotations) {
            printAnnotation(annotation);
        }
    }

    private static void printAnnotation(Annotation annotation) {
        print("\t\t " + annotation.annotationType().getSimpleName());
    }
    private static void printFieldName(Field field) {
        print("\tName of field: " + field.getName());
    }

    private static void printFieldType(Field field) {
        print("\tType of field: " + field.getType().getSimpleName());
    }
    private static void printHierarchy() {
        print("Hierarchy: ");

        Class temp = ob.getClass();
        while (temp != null) {
            print("\t" + temp.getSimpleName());
            temp = temp.getSuperclass();
        }
    }

    private static void printClassName() {
        print("Class name: " + ob.getClass().getName());
    }

    private static void printClassLoader() {
        print("Classloader: " + ob.getClass().getClassLoader());
    }

    private static void printImplements() {
        Class<?>[] interfaces = ob.getClass().getInterfaces();
        print("\tImplements: ");
        for (Class<?> inter : interfaces) {
            printImplementsName(inter);
            print("\t\tMethods: ");
            printMethods(inter.getMethods());
        }
    }

    private static void printImplementsName(Class<?> inter) {
        print("\t\t" + inter.getName());
    }

    private static void printMethods(Method[] methods) {
        for (Method method : methods) {
            printModifier(method.getModifiers());
            printMethodeReturnType(method);
            printMethodName(method);
            printMethodParameterTypes(method.getParameterTypes());
        }
    }

    private static void printModifier(int modifiers) {
        print("\t\t\tModifiers :");
        String modifier = Modifier.isPublic(modifiers) ? "public" :
                Modifier.isPrivate(modifiers) ? "protected" : "private";
        if (Modifier.isAbstract(modifiers)) {
            modifier += " abstract";
        }
        if (Modifier.isStatic(modifiers)) {
            modifier += " static";
        }
        if (Modifier.isFinal(modifiers)) {
            modifier += " final";
        }
        print("\t\t\t\t" + modifier);
    }

    private static void printMethodeReturnType(Method method) {
        print("\t\t\tReturn type: " + method.getReturnType());
    }

    private static void printMethodName(Method method) {
        print("\t\t\tMethod type: " + method.getName());
    }

    private static void printMethodParameterTypes(Class<?>[] parameterTypes) {
        print("\t\t\tTypes of method parameters: ");
        for (Class<?> parameterType : parameterTypes) {
            print("\t\t\t\t" + parameterType.getTypeName());
        }
    }
}
