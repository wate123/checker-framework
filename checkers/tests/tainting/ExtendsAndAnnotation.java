// Test case for issue 278: https://code.google.com/p/checker-framework/issues/detail?id=278

import checkers.tainting.quals.*;

class ExtendsAndAnnotation extends @Tainted Object {
    void test(@Untainted ExtendsAndAnnotation c) {
        Object o = new @Untainted ExtendsAndAnnotation();
        o = new @Tainted ExtendsAndAnnotation();
    }
}
