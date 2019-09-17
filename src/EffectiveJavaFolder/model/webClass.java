package EffectiveJavaFolder.model;

import javax.xml.ws.spi.http.HttpContext;
import java.util.Set;

public class webClass {
    HttpContext context = new HttpContext() {
        @Override
        public String getPath() {
            return null;
        }

        @Override
        public Object getAttribute(String name) {
            return null;
        }

        @Override
        public Set<String> getAttributeNames() {
            return null;
        }
    };

}
