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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.com.modelo.Carro;
import br.com.util.Message;

@Resource
public class JsonController {

	@Inject private Result result;	
	@Inject private Message message;
	
	//http://localhost:8080/vraptor-with-legacy-servlet/json/carro?carro.modelo=caixa&carro.proprietario=casa
	@Path("/json/carro")
	public void carro(Carro carro) {
		System.out.println(carro.getModelo());
		result.use(Results.json()).from(carro).serialize();
	}

}
