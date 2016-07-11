/**
 * Created by conor.mcgrath on 11/07/2016.
 */
public interface ICommand
{
    void Execute();
    void Undo();
}
