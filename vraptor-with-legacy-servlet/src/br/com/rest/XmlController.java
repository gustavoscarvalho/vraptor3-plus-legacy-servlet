/***
 * Copyright (c) 2009 Caelum - www.caelum.com.br/opensource
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.rest;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.com.modelo.Carro;

@Resource
public class XmlController {

	@Inject
	public Result result;
	
	@Inject
	private Carro carro;
	
	@Path("/xml/carro")
	public void carro() {
		result.use(Results.xml()).from(carro).serialize();
	}
	
	@Path("/xml/carros")
	public void carros() {
		List<Carro> carros = new ArrayList<Carro>();
		carros.add(carro);
		carros.add(carro);
		carros.add(carro);
 		result.use(Results.xml()).from(carros ).serialize();
	}

}
