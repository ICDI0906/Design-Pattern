package abstract_factory;
/*
 * 创建鞋子的抽象的工厂
 */
public interface ShoesFactory {
	Laces createLaces();
	Soles createSoles();
	Uppers createUppers();
}
