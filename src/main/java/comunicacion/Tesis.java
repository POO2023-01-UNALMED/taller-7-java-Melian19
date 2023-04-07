package comunicacion;

public class Tesis extends Escrito{
	
	private String idea;
	private String[] argumentos;
	private String conclusion;
	private String referencia;
	private String interpretacion;
	
	public Tesis(String origen,String titulo,String autor,int paginas,
			String idea, String[] argumentos, String conclusion,String referencia, String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencia = referencia;
		this.interpretacion = interpretacion;
	}
	
	//metodos get y set
		public String getInterpretacion() {
			return interpretacion;
		}
		public void setInterpretacion(String a) {
			interpretacion = a;
		}
		public String getIdea() {
			return idea;
		}
		public void setIdea(String a) {
			idea = a;
		}
		public String[] getArgumentos() {
			return argumentos;
		}
		public void setArgumentos(String[] a) {
			argumentos = a;
		}
		public String getConclusion() {
			return conclusion;
		}
		public void setConclusion(String a) {
			conclusion = a;
		}
		public String getReferencias() {
			return referencia;
		}
		public void setReferencias(String a) {
			referencia = a;
		}
		
		
		//metodos abstractos
		
		public int palabrasTotales(int palabrasPagina) {
			return palabrasPagina*getPaginas()*5;
		}

		public String interpretacion() {
			return getInterpretacion();
		}

		public String toString() {
			return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + getIdea() + "\n" + getArgumentos().length + "\n" + getConclusion() + "\n" + getReferencias();
		}
}
