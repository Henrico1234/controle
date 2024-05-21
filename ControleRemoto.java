package br.com.br.poo2;

public class ControleRemoto implements Controlador{
	private Integer volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto() {
		this.setVolume(50);
		this.setLigado(false);
		this.setTocando(false);
		
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean isTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		this.setLigado(true);
		
	}

	@Override
	public void desligar() {
		this.setLigado(false);
		
	}

	@Override
	public void abrirMenu() {
		System.out.println("esta ligado? " + this.isLigado());
		System.out.println("esta tocando? " + this.isTocando());
		System.out.println("volume: " + this.getVolume());
		for(int i = 0; i <= this.getVolume(); i+=10) {
			
		System.out.print("|");
			
		}
	}

	@Override
	public void fecharMenu() {
		System.out.println("fechando menu");
		
	}

	@Override
	public void maisVolume() {
		if(isLigado() == true) {
			this.setVolume(getVolume() + 5);
		} else {
		System.out.println("impossivel aumentar volume");  
	}
	}
	@Override
	public void menosVolume() {
		if(isLigado() == true) {
			this.setVolume(getVolume() - 5);
		}
		else {
			System.out.println("impossivel diminuir volume");
		}
	}

	@Override
	public void ligarMudo() {
		if(isLigado() == true) {
			if(getVolume() != 0) {
				this.setVolume(0);
			}
			
		}else {
			System.out.println("impossivel ligar o mudo");
		}
	}

	@Override
	public void desligarMudo() {
		if(isLigado()== true ) {
			if(getVolume() == 0) {
				this.setVolume(10);
			}
			
		}else {
			System.out.println("impossivel desligar o mudo");
		}
	}

	@Override
	public void play() {
		if(isLigado() == true) {
			if(isTocando() == false) {
				this.setTocando(true);
			}
				
		}
		else {
			System.out.println("impossivel dar play");
		}
		
	}

	@Override
	public void pause() {
		if(isLigado() == true) {
			if(isTocando() == true) {
				this.setTocando(false);
			}
				
		}else
			System.out.println("impossivel pausar");
		
	}
	

}
