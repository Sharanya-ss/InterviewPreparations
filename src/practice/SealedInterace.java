package practice;


//asked in optum interview
sealed interface InterfaceDenmo permits Employee,Role{
	int id();
}

non-sealed class Employee implements InterfaceDenmo{

	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
non-sealed class Role implements InterfaceDenmo{

	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 0;
	}
}

