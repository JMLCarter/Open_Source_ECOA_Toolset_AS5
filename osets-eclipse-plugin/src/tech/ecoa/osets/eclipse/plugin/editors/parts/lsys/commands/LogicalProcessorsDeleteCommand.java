/*
 * Copyright 2017, BAE Systems Limited.
 *  
 * This software and its outputs are not claimed to be fit or safe for any purpose. Any user should
 * satisfy themselves that this software or its outputs are appropriate for its intended purpose.
*/
package tech.ecoa.osets.eclipse.plugin.editors.parts.lsys.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import tech.ecoa.osets.eclipse.plugin.editors.parts.lsys.model.LogicalComputingNode;
import tech.ecoa.osets.eclipse.plugin.editors.parts.lsys.model.LogicalProcessorsNode;

public class LogicalProcessorsDeleteCommand extends Command {
	private LogicalProcessorsNode node;
	private LogicalComputingNode parent;

	public void setLocation(Rectangle rect) {
		this.node.setConstraints(rect);
	}

	@Override
	public void undo() {
		node.setParent(parent);
		parent.getChild().add(node);
		node.refreshAll(node.getRootNode());
	}

	@Override
	public void execute() {
		parent.getChild().remove(node);
		node.refreshAll(node.getRootNode());
	}

	@Override
	public boolean canRedo() {
		return true;
	}

	@Override
	public boolean canExecute() {
		return true;
	}

	@Override
	public boolean canUndo() {
		return true;
	}

	public LogicalProcessorsNode getNode() {
		return node;
	}

	public void setNode(LogicalProcessorsNode node) {
		this.node = node;
	}

	public LogicalComputingNode getParent() {
		return parent;
	}

	public void setParent(LogicalComputingNode parent) {
		this.parent = parent;
	}
}
