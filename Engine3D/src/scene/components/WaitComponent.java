package scene.components;

import core.Engine3D;

/**
 * This class is used to attach a wait behavior
 * to the scene components.
 * It is able to be triggered to wait until the
 * wait flag is triggered again.
 * Further it can wait for a given amount of time
 * (in seconds).
 *
 */
public class WaitComponent extends SceneComponent{
	private boolean isWaiting;
	private boolean decreasingCounter;
	private float counter;
	Engine3D engine;

	/**
	 * Constructor
	 * @param engine used for the counter to wait
	 * for given amount of time.
	 * @param isWaiting can be set so the component
	 * is waiting right away or not.
	 */
	public WaitComponent(Engine3D engine, boolean isWaiting) {
		setWaiting(isWaiting);
		setWaitingForever(true);
		setWaitingTime(0f);
		this.engine = engine;
	}
	
	/**
	 * Decreases the counter if
	 * decreasingcounter is set to true.
	 * Otherwise nothing happens and
	 * the component can be used to
	 * wait forever.
	 */
	private void decreaseCounter(){
		if(!waitingForever()){
				if(counter < 0){
					setWaiting(false);
					return;
				}
				counter = counter - engine.getDeltaTime();		
		}
	}

	/**
	 * @return true if component is waiting.
	 */
	public boolean isWaiting() {
		return isWaiting;
	}

	/**
	 * Sets if the component should wait
	 * or not.
	 * @param isWaiting the value to be set.
	 */
	public void setWaiting(boolean isWaiting) {
		this.isWaiting = isWaiting;
	}

	/**
	 * @return if component waits forever
	 * or until this value is triggered.
	 */
	public boolean waitingForever() {
		return !decreasingCounter;
	}

	/**
	 * Sets the value for waiting forever.
	 * @param forever
	 */
	public void setWaitingForever(boolean forever) {
		this.decreasingCounter = !forever;
	}

	/**
	 * Sets the time how long component
	 * should wait.
	 * @param counter
	 */
	public void setWaitingTime(float counter) {
		this.counter = counter;
	}

	@Override
	public void update() {
		decreaseCounter();
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
}
