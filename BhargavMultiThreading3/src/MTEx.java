public class MTEx extends Thread {
	@Override
	public void run()
	{
		for(int i=0;i<=4;i++)
		{
			System.out.println("i= "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

}


