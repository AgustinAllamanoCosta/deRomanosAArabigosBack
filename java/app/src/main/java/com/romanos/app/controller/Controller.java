
@RestController
@RequestMapping("/transformador")
public class Controller {

    @Inject
	private Service service;

    @GetMapping(value = {"/romanos/{numero}"})
    public ResponseEntity<Response> getRomano(Integer numero) {
		Response resp = null;
		try {
			resp = new Response(200, this.service.transformador(numero));
	
			return ok(resp);
		} catch(Exception e) {
			resp = new Response(500, e.getMessage());
			return ok(resp); 
		}        
    }
    
}
