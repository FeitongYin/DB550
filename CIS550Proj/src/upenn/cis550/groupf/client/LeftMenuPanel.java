package upenn.cis550.groupf.client;

import java.util.List;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.VerticalPanel;

import upenn.cis550.groupf.shared.User;
import upenn.cis550.groupf.shared.Board;

public class LeftMenuPanel extends VerticalPanel {
	public LeftMenuPanel(User currectUser, List<Board> boards, List<User> friends) {
		setBorderWidth(3);
		setSpacing(10);
		Label label = null;
		
		Label boardLabel = new Label("Boards you own");
		Panel boardPanel = new VerticalPanel();
		Label friendLabel = new Label("Friends");
		Panel friendPanel = new VerticalPanel();
		
		add(boardLabel);
		boardLabel.setSize("300", "20");
		add(boardPanel);
		boardPanel.setSize("300", "100");
		add(friendLabel);
		friendLabel.setSize("300", "20");
		add(friendPanel);
		friendPanel.setSize("300", "100");
		
		for (Board board : boards) {
			label = new Label(board.getBoardName());
			boardPanel.add(label);
		}
		
		for (User friend : friends) {
			label = new Label(friend.getName());
			friendPanel.add(label);
		}
	}
}
