import java.lang.reflect.Method;

import br.com.caelum.vraptor.http.route.PathAnnotationRoutesParser;
import br.com.caelum.vraptor.http.route.Router;
import br.com.caelum.vraptor.ioc.ApplicationScoped;
import br.com.caelum.vraptor.ioc.Component;

@Component
@ApplicationScoped
public class MyRoutesParser extends PathAnnotationRoutesParser {

    public MyRoutesParser(Router router) {
		super(router);
		// TODO Auto-generated constructor stub
	}

	@Override
    protected String[] getURIsFor(Method javaMethod, Class<?> type) {
          String[] uris = super.getURIsFor(javaMethod, type);
          for(int i = 0; i < uris.length; i++) {
        	  System.out.println(uris[i]);
               uris[i] = uris[i];
          }
          return uris;
    }
}
