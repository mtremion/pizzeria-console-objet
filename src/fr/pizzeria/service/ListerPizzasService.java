package fr.pizzeria.service;

import java.util.List;
import java.util.Scanner;

import fr.pizzeria.console.Pizza;
import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.PizzaMemDao;

public class ListerPizzasService extends MenuService 
{	
	public ListerPizzasService(IPizzaDao pMenu)
	{
		super(pMenu);
	}
	
	@Override
	public void executeUC(Scanner scanner) 
	{
		List<Pizza> tempTab = this.iPizzaDao.findAllPizzas();
		
		for(Object o : tempTab)
		{
			Pizza pizzaLu = (Pizza) o;
			System.out.println(pizzaLu.afficherPizza());
		}
	}

}
