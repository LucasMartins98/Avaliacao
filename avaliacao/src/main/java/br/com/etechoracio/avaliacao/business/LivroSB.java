package br.com.etechoracio.avaliacao.business;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.etechoracio.avaliacao.dao.LivroDAO;
import br.com.etechoracio.avaliacao.model.Livro;
import br.com.etechoracio.common.business.BaseSB;

@Service
public class LivroSB extends BaseSB{

	private LivroDAO livroDAO;
	
	@Override
	protected void postConstructImpl() {
		livroDAO = getDAO(LivroDAO.class);
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void save(Livro livro) {
		livroDAO.save(livro);
	}

}
